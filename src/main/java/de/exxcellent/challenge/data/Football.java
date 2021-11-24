package de.exxcellent.challenge.data;

import java.util.Objects;

/**
 * Football class only contains the data that is needed for example, but can easily be enhanced
 */

public class Football {

    public String teamName;
    public int goals;
    public int goalsAllowed;
    public int goalsDistance;

    public Football(String teamName, int goals, int goalsAllowed, int goalsDistance) {
        this.teamName = teamName;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
        this.goalsDistance = goalsDistance;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    @Override
    public String toString() {
        return "Football{" +
                "teamName='" + teamName + '\'' +
                ", goals=" + goals +
                ", goalsAllowed=" + goalsAllowed +
                ", goalsDistance=" + goalsDistance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Football football = (Football) o;
        return goals == football.goals && goalsAllowed == football.goalsAllowed && goalsDistance == football.goalsDistance && Objects.equals(teamName, football.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName, goals, goalsAllowed, goalsDistance);
    }
}
