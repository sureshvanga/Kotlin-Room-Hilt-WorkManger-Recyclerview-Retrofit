// Generated by Dagger (https://dagger.dev).
package com.demo.suresh.network;

import com.demo.suresh.db.AppDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetroRepository_Factory implements Factory<RetroRepository> {
  private final Provider<RetroServiceInterface> retroServiceInterfaceProvider;

  private final Provider<AppDao> appDaoProvider;

  public RetroRepository_Factory(Provider<RetroServiceInterface> retroServiceInterfaceProvider,
      Provider<AppDao> appDaoProvider) {
    this.retroServiceInterfaceProvider = retroServiceInterfaceProvider;
    this.appDaoProvider = appDaoProvider;
  }

  @Override
  public RetroRepository get() {
    return newInstance(retroServiceInterfaceProvider.get(), appDaoProvider.get());
  }

  public static RetroRepository_Factory create(
      Provider<RetroServiceInterface> retroServiceInterfaceProvider,
      Provider<AppDao> appDaoProvider) {
    return new RetroRepository_Factory(retroServiceInterfaceProvider, appDaoProvider);
  }

  public static RetroRepository newInstance(RetroServiceInterface retroServiceInterface,
      AppDao appDao) {
    return new RetroRepository(retroServiceInterface, appDao);
  }
}
