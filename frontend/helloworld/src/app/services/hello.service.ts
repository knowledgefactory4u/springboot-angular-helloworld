import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL = 'http://localhost:8080/api/v1/';

@Injectable({
  providedIn: 'root',
})
export class HelloService {
  constructor(private http: HttpClient) {}

  getServerMessage(): Observable<any> {
    return this.http.get(API_URL + 'hello', { responseType: 'text' });
  }
  
}
