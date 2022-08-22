import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs';

@Injectable()
export class UserService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users/';
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl);
  }

  public save(user: User) {
    return this.http.post<User>(this.usersUrl, user);
  }
  public delete(id: string){
    return this.http.delete<User>(`${this.usersUrl}${id}`);
  }


  public update(id :string, useData : User): Observable<any>{
    return this.http.put<User>(`${this.usersUrl}${id}`, useData);
  }
}
