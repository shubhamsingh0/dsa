package com.dsa.strivers.step1.designpattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrototypeImpl implements Prototype{
    private String name;
    private String age;

    @Override
    public Prototype clone() {
        return new PrototypeImpl(this.name,this.age);
    }

    public static void main(String[] args) {
    // Prototype design pattern is used when we have to make copy/clone from existing object and creation of object is very expensive
    // its helpful to clone private member.The cloning logic should be responsibility of class itself which we are trying to clone,
    // not the client.

        PrototypeImpl as = new PrototypeImpl("shubham","23");
        PrototypeImpl ass= (PrototypeImpl) as.clone();
    }
}
