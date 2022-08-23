import { User } from './../model/user';
import { Component, OnInit } from '@angular/core';
import { UserService } from '../service/user.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  users!: User[];
  constructor(private userService: UserService,
              private router: Router) {}


  ngOnInit(): void {
      this.userService.findAll().subscribe(data => {
      this.users = data;
    });
  }

  deleteItem(id: string, index: number) {
      this.userService.delete(id).subscribe(response =>{
      this.users.splice(index, 1);
    });
  }

  gotoUpdateList(id: string){
      this.router.navigate(['/updateUser'],
      { queryParams: { id: id } }
    );
  }
}
