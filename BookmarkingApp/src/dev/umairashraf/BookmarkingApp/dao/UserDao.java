package dev.umairashraf.BookmarkingApp.dao;


import dev.umairashraf.BookmarkingApp.DataStore;
import dev.umairashraf.BookmarkingApp.entities.User;


public class UserDao {
    public User[] getUsers() {
        return DataStore.getUsers();
    }
}
