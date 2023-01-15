
public class BachelourStudent extends AbsStudent implements IProjectScoreBehaviour {
	
public BachelourStudent(int id, float mid, float fin) {
		super(id, mid, fin);
	}

public float projectScore() {
	return 20;
}

@Override
float computeTotalScore() {
	return computeBasescore()+projectScore();
}
}
