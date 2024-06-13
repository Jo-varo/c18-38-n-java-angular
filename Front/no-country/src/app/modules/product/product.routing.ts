import { Routes } from '@angular/router';
import { ProductDetailComponent } from './components/product-detail/product-detail.component';

export const ProductRoutes: Routes = [
  {
    path: ':id',
    component: ProductDetailComponent,
  },
];
