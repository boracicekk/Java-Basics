
public class PhDStudent extends MasterStudent implements IArticleScoreBehaviour{
	int numberOfArticles;
public PhDStudent(int id, float mid, float fin, int numberOfConf,int numberOfArticles) {
		super(id, mid, fin, numberOfConf);
		this.numberOfArticles = numberOfArticles;
	}
@Override
public float articleScore() {
	return ((float) numberOfArticles * 8);
}
@Override
float computeTotalScore() {
	return (float)(computeTotalScore() + articleScore());
}
}
