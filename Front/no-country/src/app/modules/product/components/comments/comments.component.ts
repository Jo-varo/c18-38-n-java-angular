import { Component, Input, OnInit } from '@angular/core';
import { Comment, ParsedComment } from '../../types/interfaces';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-comments',
  standalone: true,
  imports: [MatIconModule],
  templateUrl: './comments.component.html',
  styleUrl: './comments.component.css',
})
export class CommentsComponent implements OnInit {
  @Input() comments: Comment[] = [];

  parsedComments: ParsedComment[] = [];

  generateArray(n: number) {
    return new Array(this.roundNumber(n));
  }

  roundNumber(n: number) {
    return Math.round(n);
  }

  ngOnInit(): void {
    this.parsedComments = this.comments.map((comment, i) => ({
      id: i,
      ...comment,
      rate: Math.round(comment.rate * 2) / 2,
    }));
  }
}
