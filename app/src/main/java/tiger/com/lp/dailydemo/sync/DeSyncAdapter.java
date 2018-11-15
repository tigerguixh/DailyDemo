package tiger.com.lp.dailydemo.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/**
 * The real magic happens here.
 * This is adapter that will be called when system decide it is time to sync data.
 * Created by Kursulla on 07/09/15.
 */
public class DeSyncAdapter extends AbstractThreadedSyncAdapter {

    public DeSyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
    }

    @Override
    public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        System.out.println("******* DeSyncAdapter *******");
//        System.out.println("*******" + syncResult.syncAlreadyInProgress+" *******");
        System.out.println("*****************************");
    }

}