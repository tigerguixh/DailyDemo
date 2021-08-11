#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_tiger_com_lp_dailydemo_utils_JniUtils_getJniString(JNIEnv *env, jclass clazz) {
  std::string hello = "Hello from C++";
  return env->NewStringUTF(hello.c_str());
}
