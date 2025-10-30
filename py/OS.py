"""
Thread lifecycle:

1. Newborn: When a thread is created, it enters this state.
2. Runnable: When the thread is started, it enters this state and is eligible to run.
3. Running: When the thread is running, it enters this state.
4. Waiting: When the thread is waiting for another thread to finish, it enters this state.
5. Timed Waiting: When the thread is waiting for a specific amount of time, it enters this state.
6. Blocked: When the thread is blocked due to I/O or other blocking operations, it enters this state.
7. Dead: When the thread has finished execution, it enters this state.
"""
import threading
import time


def thread_function(name):
    print(f"Thread {name}: starting")
    time.sleep(2) # sleep for 2 seconds meaning thread will be in runnable state for 2 seconds
    print(f"Thread {name}: finishing")

threads = [] # list to store threads
for i in range(10):
    thread = threading.Thread(target=thread_function, args=(i,))
    threads.append(thread)
    thread.start()

for thread in threads:
    thread.join()

print("All threads finished")
