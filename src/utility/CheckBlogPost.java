package utility;

import model.Blog;

public class  CheckBlogPost  extends OffensiveWordsChecker  implements OffensiveWordsInterface{

	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String blogTittle=blog.getBlogTitle();
		String[] offensiveWords={"b!tch","b00bs","b1tch","ball gag","ball gravy","2 girls 1 cup","2g1c","5hit","a55hole","acrotomophilia",
				"aeolus","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","areola","areole","arian"};
		for(int i=0;i<=offensiveWords.length;i++){
			if(blogTittle==offensiveWords[i]){
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String[] offensiveWords={"b!tch","b00bs","b1tch","ball gag","ball gravy","2 girls 1 cup","2g1c","5hit","a55hole","acrotomophilia",
				"aeolus","anal","anal impaler","anal leakage","analprobe","anilingus","anus","apeshit","areola","areole","arian"};
		String blogDescription=blog.getBlogDescription();
		for(int i=0;i<=offensiveWords.length;i++){
			if(blogDescription==offensiveWords[i]){
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		//The checkBlog(Blog blog) method in turn should invoke checkBlogTitle(Blog blog) and checkBlogDescription(Blog blog).
		//The checkBlog method should return true if there are no offensive words otherwise it should return false
		if(checkBlogDescription(blog)&&checkBlogTitle(blog)){
			return true;
		}
		
		return false;
	}
	
}