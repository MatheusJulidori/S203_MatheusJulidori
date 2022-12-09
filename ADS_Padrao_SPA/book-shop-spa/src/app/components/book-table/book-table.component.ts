import { Component, OnInit } from '@angular/core';
import { BookDTO } from '../../dtos/book.dto';
import { BookService } from '../../services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit{

  books: BookDTO[] = [];

  constructor(private service: BookService) {
  }

  ngOnInit(): void {
    this.service.findAllBooks()
    .subscribe({
      next: (data) => this.books = data,
      error: (err) => console.log(err)
    })
  }

}
