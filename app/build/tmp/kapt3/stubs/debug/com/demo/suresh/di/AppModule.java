package com.demo.suresh.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0016H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/demo/suresh/di/AppModule;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "getAppDao", "Lcom/demo/suresh/db/AppDao;", "appDatabase", "Lcom/demo/suresh/db/AppDatabase;", "getAppDatabase", "context", "Landroid/app/Application;", "getRetroInstance", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getRetroServiceInstance", "Lcom/demo/suresh/network/RetroServiceInterface;", "retrofit", "providesHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesOkHttpClient", "httpLoggingInterceptor", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BASE_URL = "https://api.github.com/search/";
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.suresh.db.AppDatabase getAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.suresh.db.AppDao getAppDao(@org.jetbrains.annotations.NotNull()
    com.demo.suresh.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.logging.HttpLoggingInterceptor providesHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.suresh.network.RetroServiceInterface getRetroServiceInstance(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit getRetroInstance(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}