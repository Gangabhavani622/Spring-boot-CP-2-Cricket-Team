// Write your code here.
package com.example.player;

public class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public void setId(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return this.playerId;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    public String getName() {
        return this.playerName;
    }

    public String getRole() {
        return this.role;
    }

}