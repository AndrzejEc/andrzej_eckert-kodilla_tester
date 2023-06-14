package com.kodilla.collections.adv.immutable;

class BookHacked extends Book{
    public BookHacked(String author, String title){
        super(author, title);
    }
    public void modifyTile(String newTtile){
        title = newTtile;
    }
}
