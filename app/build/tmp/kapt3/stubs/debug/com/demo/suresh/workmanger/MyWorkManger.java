package com.demo.suresh.workmanger;

import java.lang.System;

@androidx.hilt.work.HiltWorker()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/demo/suresh/workmanger/MyWorkManger;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "mainRepository", "Lcom/demo/suresh/network/RetroRepository;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/demo/suresh/network/RetroRepository;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "showNotification", "", "Companion", "app_debug"})
public final class MyWorkManger extends androidx.work.Worker {
    private final com.demo.suresh.network.RetroRepository mainRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "MyWorkManger";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID = "channel_id";
    public static final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.suresh.workmanger.MyWorkManger.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    private final void showNotification() {
    }
    
    @dagger.assisted.AssistedInject()
    public MyWorkManger(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull()
    com.demo.suresh.network.RetroRepository mainRepository) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/demo/suresh/workmanger/MyWorkManger$Companion;", "", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}