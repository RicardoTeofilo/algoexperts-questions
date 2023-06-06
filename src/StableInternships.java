import java.util.*;

/**
 * <div class="html">
 * <h2>Stable Internships</h2>
 * <p>
 *   A company has hired N interns to each join one of N different teams. Each
 *   intern has ranked their preferences for which teams they wish to join, and
 *   each team has ranked their preferences for which interns they prefer.
 * </p>
 * <p>
 *   Given these preferences, assign 1 intern to each team. These assignments
 *   should be "stable," meaning that there is no unmatched pair of an intern and a
 *   team such that both that intern and that team would prefer they be matched
 *   with each other.
 * </p>
 * <p>
 *   In the case there are multiple valid stable matchings, the solution that is
 *   most optimal for the interns should be chosen (i.e. every intern should be
 *   matched with the best team possible for them).
 * </p>
 * <p>
 *   Your function should take in 2 2-dimensional lists, one for interns and
 *   one for teams. Each inner list represents a single intern or team's preferences,
 *   ranked from most preferable to least preferable. These lists will always be
 *   of length N, with integers as elements. Each of these integers corresponds
 *   to the index of the team/intern being ranked. Your function should return a
 *   2-dimensional list of matchings in no particular order. Each matching should
 *   be in the format [internIndex, teamIndex].
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">interns</span> = [
 *   [0, 1, 2],
 *   [1, 0, 2],
 *   [1, 2, 0]
 * ]
 * </pre>
 * <pre><span class="CodeEditor-promptParameter">teams</span> = [
 *   [2, 1, 0],
 *   [1, 2, 0],
 *   [0, 2, 1]
 * ]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre><span class="CodeEditor-promptComment">// This is the most optimal solution for interns</span>
 * [
 *   [0, 0],
 *   [1, 1],
 *   [2, 2]
 * ]
 * </pre>
 *
 * <pre><span class="CodeEditor-promptComment">// This is also a stable matching, but it is suboptimal for the interns
 * // because interns 0 and 2 could have been given better team matchings</span>
 * [
 *   [2, 0],
 *   [1, 1],
 *   [0, 2]
 * ]
 * </pre>
 * </div>
 */
public class StableInternships {

    public int[][] stableInternships(int[][] interns, int[][] teams) {


        //this holds the map from Team to Intern
        Map<Integer, Integer> teamToInternMatches = new HashMap<>();
        //this holds the list of current intern choice for team
        int[] currentInternChoices = new int[interns.length];

        //This will hold the list of unmatched interns
        //The list becomes full
        Stack<Integer> freeInternStack = new Stack<>();
        for(int i = 0; i < interns.length; i++){
            freeInternStack.push(i);
        }

        //this will contain a list for all teams, where each team
        //contains a map with the intern number and how it ranks for each team
        List<Map<Integer, Integer>> teamMaps = new ArrayList<>(teams.length);
        for(int[] team: teams){
            Map<Integer, Integer> internRank = new HashMap<>();
            for(int i = 0; i < team.length; i++){
                internRank.put(team[i], i);
            }
            teamMaps.add(internRank);
        }

        while(!freeInternStack.isEmpty()){
            int currentIntern = freeInternStack.pop();
            int[] currentInternPreferences = interns[currentIntern];
            int teamPreference = currentInternPreferences[currentInternChoices[currentIntern]];
            currentInternChoices[currentIntern] += 1;

            if(!teamToInternMatches.containsKey(teamPreference)){
                teamToInternMatches.put(teamPreference, currentIntern);
            }else{

                int previousIntern = teamToInternMatches.get(teamPreference);
                Map<Integer, Integer> teamInternRank = teamMaps.get(teamPreference);
                int previousInternRank = teamInternRank.get(previousIntern);
                int currentInternRank = teamInternRank.get(currentIntern);

                if(previousInternRank < currentInternRank){
                    freeInternStack.push(currentIntern);
                }else{
                    //this will replace the current team to intern match
                    teamToInternMatches.put(teamPreference, currentIntern);
                    freeInternStack.push(previousIntern);
                }
            }
        }

        int[][] finalInternMatches = new int[interns.length][2];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry: teamToInternMatches.entrySet()){
            finalInternMatches[i] = new int[]{entry.getValue(), entry.getKey()};
            i++;
        }

        return finalInternMatches;
    }


}
