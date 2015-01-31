package test;

/**
 * Google Job Interview, create an integer array of one dimension and 4
 * positions and create the needed method to increment it
 * 
 * @author guifre
 * 
 */
public class Array {
	private int[] num;

	public Array() {
		this.num = new int[4];
		this.test(1, 2, 3, 4);
		this.test(1, 2, 3, 9);
		this.test(1, 2, 9, 9);
		this.test(1, 9, 9, 9);
		this.test(9, 9, 9, 9);
		this.test(9, 9, 9, 4);
		this.test(9, 9, 3, 1);
		this.test(9, 2, 3, 4);

	}

	public void test(int a, int b, int c, int d) {
		this.num[0] = a;
		this.num[1] = b;
		this.num[2] = c;
		this.num[3] = d;
		System.out.println("Before: " + this.num[0] + "" + this.num[1] + "" + this.num[2] + "" + this.num[3]);
		this.inc();
		System.out.println("After:  " + this.num[0] + "" + this.num[1] + "" + this.num[2] + "" + this.num[3] + "\n");
	}

	public void inc() {
		if (this.num[3] == 9) {
			this.num[3] = 0;
			if (this.num[2] == 9) {
				this.num[2] = 0;
				if (this.num[1] == 9) {
					this.num[1] = 0;
					if (this.num[0] == 9) {
						this.num[0] = 0;
					} else {
						this.num[0] = this.num[0] + 1;
					}
				} else {
					this.num[1] = this.num[1] + 1;
				}
			} else {
				this.num[2] = this.num[2] + 1;
			}
		} else {
			this.num[3] = this.num[3] + 1;
		}

	}
}
