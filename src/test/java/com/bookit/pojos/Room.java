package com.bookit.pojos;

import java.util.Objects;

/**{        "id": 112,
 *         "name": "harvard",
 *         "description": "veritas",
 *         "capacity": 6,
 *         "withTV": true,
 *         "withWhiteBoard": false}*/
public class Room {
    private int id;
    private String name;
    private String description;
    private String capacity;
    private String withTV;
    private String withWhiteBoard;

    public Room() {
    }

    public Room(String name, String description, String capacity, String withTV, String withWhiteBoard) {
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.withTV = withTV;
        this.withWhiteBoard = withWhiteBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id &&
                name.equals(room.name) &&
                description.equals(room.description) &&
                capacity.equals(room.capacity) &&
                withTV.equals(room.withTV) &&
                withWhiteBoard.equals(room.withWhiteBoard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, capacity, withTV, withWhiteBoard);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", capacity='" + capacity + '\'' +
                ", withTV='" + withTV + '\'' +
                ", withWhiteBoard='" + withWhiteBoard + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getWithTV() {
        return withTV;
    }

    public void setWithTV(String withTV) {
        this.withTV = withTV;
    }

    public String getWithWhiteBoard() {
        return withWhiteBoard;
    }

    public void setWithWhiteBoard(String withWhiteBoard) {
        this.withWhiteBoard = withWhiteBoard;
    }
}
