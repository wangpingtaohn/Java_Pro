package com.wpt.clone;

public class DeepCopy implements Cloneable {
    User user;
    long a;
    DeepCopy(User u, long b) {
        user = u;
        a = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//    	DeepCopy d = (DeepCopy) super.clone();
//    	d.user = (User) d.user.clone();
    	DeepCopy d = new DeepCopy((User)user.clone(), a);

        return d;
    }

	@Override
	public String toString() {
		return "DeepCopy [user=" + user + ", a=" + a + ", hashCode()=" + hashCode() + "]";
	}
}
