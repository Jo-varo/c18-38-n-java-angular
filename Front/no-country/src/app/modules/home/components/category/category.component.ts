import { Component, Input, OnInit } from '@angular/core';

@Component({
  standalone: true,
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  @Input() categoryName:string = 'Category name';
  @Input() imgUrl:string = 'https://elolivar.es/olivar-content/uploads/2023/04/oficiante-de-bodas.png';

  constructor() { }

  ngOnInit() {
  }

}
