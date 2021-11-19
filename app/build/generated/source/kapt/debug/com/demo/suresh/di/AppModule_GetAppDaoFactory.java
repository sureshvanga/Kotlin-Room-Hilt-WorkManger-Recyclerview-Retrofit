// Generated by Dagger (https://dagger.dev).
package com.demo.suresh.di;

import com.demo.suresh.db.AppDao;
import com.demo.suresh.db.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetAppDaoFactory implements Factory<AppDao> {
  private final AppModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public AppModule_GetAppDaoFactory(AppModule module, Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public AppDao get() {
    return getAppDao(module, appDatabaseProvider.get());
  }

  public static AppModule_GetAppDaoFactory create(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_GetAppDaoFactory(module, appDatabaseProvider);
  }

  public static AppDao getAppDao(AppModule instance, AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.getAppDao(appDatabase));
  }
}