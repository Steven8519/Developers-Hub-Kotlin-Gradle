import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";
import {Developer} from "../../model/developer";
import {DeveloperService} from "../../service/developer.service";

@Component({
  selector: 'app-developerlist',
  templateUrl: './developerlist.component.html',
  styleUrls: ['./developerlist.component.scss']
})
export class DeveloperlistComponent implements OnInit {

  developers: Observable<Developer[]>;

  constructor(private developerService: DeveloperService) { }

  ngOnInit() {
  }

  reloadData() {
    this.developers = this.developerService.getDeveloperList();
  }

}
