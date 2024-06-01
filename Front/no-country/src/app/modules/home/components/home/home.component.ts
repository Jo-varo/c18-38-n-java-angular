import { Component, OnInit } from '@angular/core';
import { SearchBarComponent } from '../search-bar/search-bar.component';
import { CategoryComponent } from '../category/category.component';
import { ProductComponent } from '../product/product.component';

@Component({
  standalone: true,
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  imports: [SearchBarComponent, CategoryComponent, ProductComponent],
})
export class HomeComponent implements OnInit {

  constructor() {}

  ngOnInit() {
  }
}
