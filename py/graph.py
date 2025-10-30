class Graph:
    def __init__(self):
        self.adj_list = {}

    def add_node(self, node):
        if node not in self.adj_list:
            self.adj_list[node] = []

    def add_edge(self, node1, node2):
        if node1 in self.adj_list and node2 in self.adj_list:
            self.adj_list[node1].append(node2)
            self.adj_list[node2].append(node1)

    def print_graph(self):
        for node in self.adj_list:
            print(node, "->", self.adj_list[node])

    def remove_node(self, node):
        if node in self.adj_list:
            for neighbor in self.adj_list[node]:
                self.adj_list[neighbor].remove(node)
            del self.adj_list[node]
        else:
            print("Node not found")

    def remove_edge(self, node1, node2):
        if node1 in self.adj_list and node2 in self.adj_list:
            if node2 in self.adj_list[node1]:
                self.adj_list[node1].remove(node2)
            if node1 in self.adj_list[node2]:
                self.adj_list[node2].remove(node1)
        else:
            print("edges  not found")


    def find_path(self, start, end, path=[]):
        path = path + [start]
        if start == end:
            return path
        if start not in self.adj_list:
            return None
        for node in self.adj_list[start]:
            if node not in path:
                new_path = self.find_path(node, end, path)
                if new_path:
                    return new_path
        return None
           
    def display_graph(self):
        for node in self.adj_list:
            print(node, "->", self.adj_list[node])
        print()


g = Graph()
g.add_node("A")
g.add_node("B")
g.add_node("C")
g.add_node("D")
g.add_node("E")
g.add_node("F")
g.add_node("G")
g.add_node("H")

g.add_edge("A", "B")
g.add_edge("A", "C")
g.add_edge("B", "D")
g.add_edge("B", "E")
g.add_edge("C", "F")
g.add_edge("C", "G")
g.add_edge("D", "H")
g.add_edge("E", "H")
g.add_edge("F", "H")
g.add_edge("G", "H")
g.print_graph()
g.display_graph()
g.find_path("A", "H")
print(g.find_path("A", "H"))



# Graph used as a adjacency list