import { Routes, RouterModule } from '@angular/router';
import { CommentsComponent } from './components/comments/comments.component';
import { OrdersComponent } from './components/orders/orders.component';

export const SellerDashboardRoutes: Routes = [
  {
    path: "comments",
    component: CommentsComponent
  },
  {
    path: "orders",
    component: OrdersComponent
  }
];
