import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DeveloperService {

  private url = 'http://localhost:8080/api/v1/developers';

  constructor(private http: HttpClient) { }

  getDeveloperList(): Observable<any> {
    return this.http.get(`${this.url}`)
  }

  getDeveloper(id: number): Observable<Object> {
    return this.http.get(`${this.url}/${id}`)
  }

  addDeveloper(developer: Object): Observable<Object> {
    return this.http.post(`${this.url}` + `/new`, developer);
  }

  updateDeveloper(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.url}/${id}`, value)
  }

  deleteDeveloper(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`, { responseType: 'text' });
  }
}
