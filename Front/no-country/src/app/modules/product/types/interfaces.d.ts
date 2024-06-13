export interface Product {
  id:               number;
  "product-name":   string;
  description:      string;
  stock:            number;
  price:            number;
  rating:           number;
  location:         Location;
  "payment-method": string;
  features:         Features;
  "image-url":      string;
  company:          Company;
}

export interface Company {
  "company-name": string;
  description:    string;
  rating:         number;
  "image-url":    string;
  contact:        Contact;
  comments:       Comment[];
}

export interface Comment {
  "comment-body": string;
  "user-name":    string;
  rate:           number;
}
export interface ParsedComment {
  id:             number;
  "comment-body": string;
  "user-name":    string;
  rate:           number;
}

export interface Contact {
  phone:      string;
  instagram:  string;
  facebook:   string;
  "web-page": string;
}

export interface Features {
  content:  string;
  size:     string;
  tag:      string;
  category: string;
  target:   string;
}

export interface Location {
  country: string;
  city:    string;
  address: string;
}