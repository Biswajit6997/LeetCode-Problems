class Solution {
public:
    bool parseBoolExpr(string exp) {
        int n=exp.size();

        stack<char> st;
        // !,|,&,t,f -> matters to us
        // , , (, ) -> not matters to us
        for(int i=0;i<n;i++)
        {
            char c = exp[i];
            bool one = 0, zero = 1;
            while(!st.empty() && c==')')
            {
                char ele = st.top();
                st.pop();

                if(ele == 'f')
                 zero = 0;
                else if(ele == 't')
                 one = 1;

                else if(ele == '|')
                {
                    c = (one | zero) ? 't' : 'f';
                }
                else if(ele == '&')
                {
                    c = (one & zero) ? 't' : 'f';
                }
                else if(ele == '!')
                {
                    c = one ? 'f' : 't';
                }
            }

            if(c == '(' || c==',' || c==')')
             continue;
            
            st.push(c);
        }

        return st.top() == 't' ? true : false;
    }
};