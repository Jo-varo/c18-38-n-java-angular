import { Component, Input, OnInit } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';

@Component({
  standalone: true,
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
  imports: [MatButtonModule]
})
export class ProductComponent implements OnInit {

  @Input() product: any;

  constructor() { }

  ngOnInit() {
  }

  viewProduct(){
    console.log("You have pressed me");
  }

}
