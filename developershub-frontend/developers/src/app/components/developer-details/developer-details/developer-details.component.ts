import {Component, Input, OnInit} from '@angular/core';
import {Developer} from "../../../model/developer";
import {DeveloperService} from "../../../service/developer.service";
import {DeveloperlistComponent} from "../../developerlist/developerlist.component";

@Component({
  selector: 'app-developer-details',
  templateUrl: './developer-details.component.html',
  styleUrls: ['./developer-details.component.scss']
})
export class DeveloperDetailsComponent implements OnInit {

  @Input() developer: Developer;

  constructor(private developerService: DeveloperService, private developerlist: DeveloperlistComponent) { }

  ngOnInit() {
  }

  updateIsActive(isActive: boolean) {
    this.developerService.updateDeveloper(this.developer.id, {
      firstName: this.developer.fristName, lastName: this.developer.lastName,
      age: this.developer.age, email: this.developer.email, phoneNumber: this.developer.phoneNumber,
      jobTitle: this.developer.jobTitle, companyWorkFor: this.developer.companyWorkFor,
      typeOfDevloper: this.developer.typeOfDeveloper, programminLanguages: this.developer.programmingLanguages,
      isEmployed: this.developer.isEmployed, address: this.developer.address, companyEmployedTo: this.developer.companyEmployedTo,
      isActive: isActive
    }).subscribe(
      data => {
        console.log(data);
        this.developer = data as Developer;
      },
      error => console.log(error));
  }

  deleteDeveloper() {
    this.developerService.deleteDeveloper(this.developer.id).subscribe(
      data => {
        console.log(data);
        this.developerlist.reloadData();
      },

    error => console.log(error))
  }

}
