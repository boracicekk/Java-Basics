
public abstract class AbsStudent {
private int id;
private float mid;
private float fin;
public AbsStudent(int id,float mid,float fin) {
	this.id = id;
	this.mid = mid;
	this.fin = fin;
}
abstract float computeTotalScore();
float computeBasescore() {
	return (float)(mid * 0.4 + fin * 0.6);
}
}

