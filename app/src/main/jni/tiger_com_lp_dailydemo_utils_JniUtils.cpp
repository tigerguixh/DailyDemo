#include <jni.h>
#include <string>
#include <sys/stat.h>
#include <cstdio>
const int TID1_LEN=37;

extern "C"
JNIEXPORT jcharArray JNICALL
Java_tiger_com_lp_dailydemo_utils_JniUtils_getJniString(JNIEnv *env, jclass clazz) {
    FILE *fp = fopen("/proc/sys/kernel/random/boot_id", "r");
    jcharArray bootIdRes = env->NewCharArray(TID1_LEN);
    //2.获取数组指针
    jchar *arr = env->GetCharArrayElements(bootIdRes, NULL);
    if (fp == NULL) {
        //获取失败
    } else {
        unsigned char c;
        int i = 0;
        while (i < TID1_LEN) {
            c = fgetc(fp);
            arr[i] = c;
            i = i + 1;
        }
        if (ferror(fp)) {
            //获取失败
        }
    }
    //直接返回char数组，防止部分机型UTF-8转String错误
    env->ReleaseCharArrayElements(bootIdRes, arr, 0);
    return bootIdRes;
}

extern "C"
JNIEXPORT jstring JNICALL
Java_tiger_com_lp_dailydemo_utils_JniUtils_getJniString2(JNIEnv *env, jclass clazz) {
    struct stat sb;
    int updates,updatens;
    if (stat("/data/data", &sb) == -1) {
        //获取失败
    } else {
        updatens = (int) sb.st_atim.tv_nsec;
        updates = (int) sb.st_atim.tv_sec;
    }
    std::string idRes = std::to_string(updates) + "." + std::to_string(updatens);
    return env->NewStringUTF(idRes.c_str());
}

extern "C"
JNIEXPORT  jintArray JNICALL
Java_tiger_com_lp_dailydemo_utils_JniUtils_getJniString3(JNIEnv *env, jclass clazz) {
    struct stat sb;
    int updates, updatens;
    if (stat("/data/data", &sb) == -1) {
        //获取失败
    } else {
        updatens = (int) sb.st_atim.tv_nsec;
        updates = (int) sb.st_atim.tv_sec;
    }
    jintArray jintRdRes = env->NewIntArray(2);
    //2.获取数组指针
    jint *arr = env->GetIntArrayElements(jintRdRes, NULL);
    arr[0] = updates;
    arr[1] = updatens;
    env->ReleaseIntArrayElements(jintRdRes, arr, 0);
    return jintRdRes;
}
