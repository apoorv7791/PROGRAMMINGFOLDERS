import re

variables: dict[str, object] = {}


def evaluateExpressions(expr):
    for var, val in variables.items():
        expr = expr.replace(var, str(val))
        try:
            return eval(expr)
        except Exception:
            return expr.strip()


def run_line(line):
    line = line.strip()

    if line.startswith("let"):
        match = re.match(r"let\s+(\w+)\s*=\s*(.+)", line)
        if match:
            var, expr = match.groups()
            variables[var] = evaluateExpressions(expr)
    elif line.startswith("print"):
        expr = line[6:]
        print(evaluateExpressions(expr))
    elif line == "":
        pass
    else:
        print(f"Error occured at line: {line}")


def run_code(code: str):
    for line in code.splitlines():
        run_line(line)


# Example program
program = """
let x = 10
let y = 20
print x + y
print "Hello World"
"""

run_code(program)
