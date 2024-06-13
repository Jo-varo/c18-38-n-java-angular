import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'auth',
    loadChildren: () =>
      import('./modules/auth/auth.routes').then((route) => route.AuthRoutes),
  },
  {
    path: 'home',
    loadChildren: () =>
      import('./modules/home/home.routing').then((route) => route.HomeRoutes),
  },
  {
    path: 'seller-dashboard',
    loadChildren: () =>
      import('./modules/seller-dashboard/seller-dashboard.routing').then(
        (route) => route.SellerDashboardRoutes
      ),
  },
  {
    path: 'product',
    loadChildren: () =>
      import('./modules/product/product.routing').then(
        (route) => route.ProductRoutes
      ),
  },
  {
    path: '**',
    redirectTo: '/home',
  },
];
