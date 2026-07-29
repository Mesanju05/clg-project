graph={
    '5':['3','7'],
    '3':['2','4'],
    '7':['8'],
    '2':[],
    '4':['8'],
    '8':[]
}
visited=[]
stack=[]
def dfs(graph,node):
    visited.append(node)
    stack.append(node)
    while stack:
        m=stack.pop()
        print(m,end=" ")
        for neighbour in reversed(graph[m]):
            if neighbour not in visited:
                visited.append(neighbour)
                stack.append(neighbour)
dfs(graph,'5')