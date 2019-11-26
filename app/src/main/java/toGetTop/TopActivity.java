package toGetTop;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;

import java.util.List;

/**
 * 获取栈顶activity的名称,然后通过onResume()方法启动它,由于现在是单个应用,所以暂时不考虑判断栈顶activity是否属于当前进程
 */
@TargetApi(25)
public class TopActivity {
    public static String getTopActivityName(Context context){
        String processName=null;
        String topActivityName=null;
        ActivityManager activityManager =
                (ActivityManager)(context.getSystemService(android.content.Context.ACTIVITY_SERVICE )) ;
        List<ActivityManager.RunningTaskInfo> runningTaskInfos = activityManager.getRunningTasks(1) ;
        if(runningTaskInfos != null){
            ComponentName f=runningTaskInfos.get(0).topActivity;
            String topActivityClassName=f.getClassName();
            String temp[]=topActivityClassName.split("\\.");
            //栈顶Activity的名称
            topActivityName=temp[temp.length-1];
            int index=topActivityClassName.lastIndexOf(".");
            //栈顶Activity所属进程的名称
            processName=topActivityClassName.substring(0, index);
            System.out.println("---->topActivityName="+topActivityName+",processName="+processName);

        }
        return topActivityName;
}
}
