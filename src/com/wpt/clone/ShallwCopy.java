package com.wpt.clone;

public class ShallwCopy implements Cloneable {

    User user;
    long a;

    ShallwCopy(User u, long b) {
        user = u;
        a = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Account acc = (Account) super.clone();
        // acc.user = (User) acc.user.clone();
        // return acc;

        return super.clone();
    }

	@Override
	public String toString() {
		return "ShallwCopy [user=" + user + ", a=" + a + ", hashCode()=" + hashCode() + "]";
	}
    
}
