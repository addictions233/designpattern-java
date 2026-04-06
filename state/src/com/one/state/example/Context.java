package com.one.state.example;

public class Context {

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }
}
