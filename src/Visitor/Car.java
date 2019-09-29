package Visitor;

import java.util.List;

class Car implements CarElement {
    private final List<CarElement> elements;

    public Car() {
        this.elements = List(
            new Wheel("front left"), new Wheel("front right"),
            new Wheel("back left"), new Wheel("back right"),
            new Body(), new Engine()
        );
    }

    public List<CarElement> List(Wheel wheel, Wheel wheel2, Wheel wheel3, Wheel wheel4, Body body, Engine engine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}

