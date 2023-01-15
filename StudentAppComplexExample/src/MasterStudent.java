
public class MasterStudent extends AbsStudent implements IConferanceScoreBehaviour {
	protected int numberOfConf;
public MasterStudent(int id, float mid, float fin,int numberOfConf) {
		super(id, mid, fin);
		this.numberOfConf=numberOfConf;
	}
@Override
public float conferanceScore() {
	return numberOfConf * 5;
}
@Override
float computeTotalScore() {
	return computeBasescore() + conferanceScore();
}

}
