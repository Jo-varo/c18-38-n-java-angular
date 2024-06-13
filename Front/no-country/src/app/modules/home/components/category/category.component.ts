import { Component, Input, OnInit } from '@angular/core';
import { CategoryService } from '../../../../core/services/category.service';

@Component({
  standalone: true,
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  @Input() categoryName:string = 'Category name';
  @Input() imgUrl:string = 'https://elolivar.es/olivar-content/uploads/2023/04/oficiante-de-bodas.png';

  constructor(
    private categorySvc: CategoryService,
  ) { }

  ngOnInit() {
  }

  sendCategory(categoryName: any){
    let newCategory;
    switch (categoryName) {
      case "Cumpleaños":
        newCategory = "CUMPLEAÑOS";
        break;
      case "Día de las madres":
        newCategory = "DIA_DE_LAS_MADRES";
        break;
      case "Aniversario":
        newCategory = "ANIVERSARIO";
        break;
      case "Navidad":
        newCategory = "NAVIDAD";
        break;
      default:
        newCategory = "";
        break;
    }
    this.categorySvc.categoryName = newCategory;
  }

}
