//Exercise 9
interface Command {
    void execute();
}
class Light {
    void on() {
        System.out.println("Light ON");
    }
    void off() {
        System.out.println("Light OFF");
    }
}
class LightOnCommand implements Command {
    Light light;
    LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
class LightOffCommand implements Command {
    Light light;
    LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }
}
class RemoteControl {
    Command command;
    RemoteControl(Command command) {
        this.command = command;
    }
    void pressButton() {
        command.execute();
    }
}
public class CommandPattern {
    public static void main(String[] args) {
        Light light = new Light();
        new RemoteControl(new LightOnCommand(light)).pressButton();
        new RemoteControl(new LightOffCommand(light)).pressButton();
    }
}