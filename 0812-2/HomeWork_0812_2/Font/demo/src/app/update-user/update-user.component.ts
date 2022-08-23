import { Component, OnInit } from '@angular/core';
import { User } from './../model/user';
import { UserService } from '../service/user.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
 user:User;




  constructor(
      private route: ActivatedRoute,
      private router: Router,
      private userService: UserService
  ) {
    this.user = new User();
  }


    updateSubmit() {  //
        this.route.queryParams.subscribe(params => {
        this.userService.update(params['id'], this.user).subscribe
        (result => this.gotoUserList());
    })
  }

  gotoUserList() {
    this.router.navigate(['/users']
    );
  }

  ngOnInit(): void {

  }
}
