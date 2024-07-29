package practice;

public class no_of_team {
    public static void main(String[] args) {
    int []arr = {2,5,3,4,1};
    int ans = count(arr);
        System.out.println(ans);
    }
    static int count(int rating[]){
                int ans = 0;
                int count = 0;
                for(int i = 0;i<=rating.length-1;i++){
                    for(int j = i+1;j<=rating.length-1;j++){
                        for(int k = j+1;k<=rating.length-1;k++){
                            if(rating[i]>rating[j+1] && rating[j]>rating[k+1]){
                                ans++;
                            }
                        }
                    }
                }
                for(int i = rating.length-1;i>=0;i--){
                    for(int j = i+1;j>=0;j--){
                        for(int k = j+1;k>=0;k--){
                            if(rating[i]<rating[j+1] && rating[j+1]<rating[k+1]){
                                count++;
                            }
                        }
                    }
                }
                return ans+count;

            }
        }

