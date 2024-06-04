import { Component, OnInit } from '@angular/core';
import { SearchBarComponent } from '../search-bar/search-bar.component';
import { ProductComponent } from '../product/product.component';
import { CategoriesComponent } from '../categories/categories.component';

@Component({
  standalone: true,
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  imports: [SearchBarComponent, CategoriesComponent, ProductComponent],
})
export class HomeComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
}
