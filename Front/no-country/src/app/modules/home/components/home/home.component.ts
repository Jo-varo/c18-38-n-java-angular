import { Component, OnInit } from '@angular/core';
import { SearchBarComponent } from '../search-bar/search-bar.component';
import { ProductComponent } from '../product/product.component';
import { CategoriesComponent } from '../categories/categories.component';
import * as ProductsMock from '../../../../../data/mocks.json';
import { CommonModule } from '@angular/common';

@Component({
  standalone: true,
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  imports: [SearchBarComponent, CategoriesComponent, ProductComponent, CommonModule],
})
export class HomeComponent implements OnInit {

  mock: any = ProductsMock;
  products: any[];


  constructor() {}

  ngOnInit() {
    this.products = this.mock.default;
  }

  filterProducts(location: string){
    if(location != ""){
      this.products = this.mock.default;
      this.products = this.products.filter((product) => product.location.city.toLocaleLowerCase() === location);
    }else{
      this.products = this.mock.default;
    }
  }
}
