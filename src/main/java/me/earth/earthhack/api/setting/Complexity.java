package me.earth.earthhack.api.setting;

public enum Complexity {
    Beginner,
    Medium,
    Expert;

    public boolean shouldDisplay(Setting<?> setting) {
        return setting.getComplexity().ordinal() <= this.ordinal();
    }

}
