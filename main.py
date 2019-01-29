import cv2

cap = cv2.VideoCapture('rtmp://192.168.100.4/live/STREAM_NAME')


while cap.isOpened():
    ret, frame = cap.read()
    cv2.imshow('frame', frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()