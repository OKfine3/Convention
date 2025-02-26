package edu.ustb.crypto.convention.config;

import java.util.List;
import java.util.Map;

public class Mapping {
    private List<Map<String, String>> party;
    private List<Map<String, String>> asset;
    private List<Map<String, String>> action;
    private List<Map<String, String>> attribute;

    // getters and setters

    public List<Map<String, String>> getParty() {
        return party;
    }

    public void setParty(List<Map<String, String>> party) {
        this.party = party;
    }

    public List<Map<String, String>> getAsset() {
        return asset;
    }

    public void setAsset(List<Map<String, String>> asset) {
        this.asset = asset;
    }

    public List<Map<String, String>> getAction() {
        return action;
    }

    public void setAction(List<Map<String, String>> action) {
        this.action = action;
    }

    public List<Map<String, String>> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Map<String, String>> attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Config{" + "\n" +
                "party=" + party + ",\n" +
                "asset=" + asset + ",\n" +
                "action=" + action + ",\n" +
                "attribute=" + attribute + "\n" +
                '}';
    }
}