class Solution1 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();

        for(String email : emails)
        {
            int idx = email.indexOf("@");
            String local = email.substring(0, idx);
            String rest = email.substring(idx);

            if(local.contains("+"))
                local = local.substring(0, local.indexOf("+"));

            local = local.replaceAll("\\.", "");
            set.add(local + rest);
        }

        return set.size();
    }
}

class Solution2 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for(String email: emails) {
            String ans = "";
            int i = 0;
            for(i = 0; i < email.length(); i++) {
                if(email.charAt(i) == '.')
                    continue;


                if(email.charAt(i) == '+') {
                    while(email.charAt(i) != '@')
                        i++;
                }

                if(email.charAt(i) == '@')
                    break;
                    
                ans += email.charAt(i);
            }

            System.out.println(email.substring(i, email.length()));

            ans += email.substring(i, email.length());

            set.add(ans);
        }

        return set.size();
    }
}
