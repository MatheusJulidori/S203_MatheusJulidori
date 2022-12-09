import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BookDTO } from '../dtos/book.dto';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private client: HttpClient) { }

  public findAllBooks(): Observable<BookDTO[]>{
    let res = this.client.get<BookDTO[]>("http://localhost:8080/book");
    console.log(res);
    return res;
  }
}
